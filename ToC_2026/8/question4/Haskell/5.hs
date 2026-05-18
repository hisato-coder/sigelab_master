-- 5.hs (カットオフ減算)
iszero :: Int -> Bool
iszero m = m == 0

pi_ :: Int -> Int
pi_ m = if m == 0 then 0 else m - 1

cut_off_sub :: Int -> Int -> Int
cut_off_sub m n = if iszero n
                  then m
                  else cut_off_sub (pi_ m) (pi_ n)

main :: IO ()
main = do
    putStrLn "Enter two numbers (m n): "
    [m, n] <- map read . words <$> getLine
    let result = cut_off_sub m n
    putStrLn $ "The cut-off subtraction of " ++ show m ++ " and " ++ show n ++ " is " ++ show result