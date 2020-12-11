module Alphabet where
  import Data.Char

  translate :: Char -> String
  translate c = let
    l = toLower c
    in if l >= 'a' && l <= 'z' then (":alphabet-white-" ++ [l] ++ ":") else [l]

  main :: IO ()
  main = do
    putStrLn "Gimme your wordz!"
    line <- getLine
    putStrLn (line >>= translate)
