--to compile using ghci.

square :: Int -> Int
square x = x*x
squareList :: [Int] -> Int
squareList xs
  |xs==[] = 0*0
  |otherwise = (head xs) * (head xs) + (squareList (tail xs))
