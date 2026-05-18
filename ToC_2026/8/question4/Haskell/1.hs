//階乗関数 fac(m) = m!
iszero :: Int -> Bool
iszero m = m == 0

pi_ :: Int -> Int
pi_ m = if m == 0 then 0 else m - 1

fac :: Int -> Int
fac m = if iszero m then 1 else m * fac (pi_ m)

main :: IO ()
main = do
    putStrLn "Enter a number: "
    m <- readLn
    putStrLn $ "The factorial of " ++ show m ++ " is " ++ show (fac m)