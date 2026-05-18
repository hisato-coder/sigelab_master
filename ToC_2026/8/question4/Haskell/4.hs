iszero :: Int -> Bool
iszero m = m == 0

pi_ :: Int -> Int
pi_ m = if m == 0 then 0 else m - 1

lt :: Int -> Int -> Bool
lt m n = if iszero n then False else if iszero m then True else lt (pi_ m) (pi_ n)

cut_off_sub :: Int -> Int -> Int
cut_off_sub m n = if iszero n then m else cut_off_sub (pi_ m) (pi_ n)

mod_ :: Int -> Int -> Int
mod_ m n = if iszero n
           then -1
           else if lt m n
                then m
                else mod_ (cut_off_sub m n) n

main :: IO ()
main = do
    putStrLn "Enter two numbers (m n): "
    [m, n] <- map read . words <$> getLine
    let result = mod_ m n
    if result == -1
        then putStrLn "Error: Cannot divide by zero."
        else putStrLn $ "The remainder of " ++ show m ++ " divided by " ++ show n ++ " is " ++ show result