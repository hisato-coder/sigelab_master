//数値の等価演算子 eq
iszero :: Int -> Bool
iszero m = m == 0

pi_ :: Int -> Int
pi_ m = if m == 0 then 0 else m - 1

eq :: Int -> Int -> Bool
eq m n = if iszero m
         then iszero n
         else if iszero n
              then False
              else eq (pi_ m) (pi_ n)

main :: IO ()
main = do
    putStrLn "Enter two numbers: "
    [m, n] <- map read . words <$> getLine
    if eq m n
        then putStrLn $ show m ++ " and " ++ show n ++ " are equal."
        else putStrLn $ show m ++ " and " ++ show n ++ " are not equal."