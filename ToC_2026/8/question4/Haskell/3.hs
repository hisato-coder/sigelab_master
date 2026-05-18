//2つの自然数 m と n を取りm < n の真理値を返す lt
iszero :: Int -> Bool
iszero m = m == 0

pi_ :: Int -> Int
pi_ m = if m == 0 then 0 else m - 1

lt :: Int -> Int -> Bool
lt m n = if iszero n
         then False
         else if iszero m
              then True
              else lt (pi_ m) (pi_ n)

main :: IO ()
main = do
    putStrLn "Enter two numbers: "
    [m, n] <- map read . words <$> getLine
    if lt m n
        then putStrLn $ show m ++ " is less than " ++ show n ++ "."
        else putStrLn $ show m ++ " is not less than " ++ show n ++ "."