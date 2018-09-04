(ns fizzbuzz.core)

(defn fizz-buzz [input]
  (if (= input 3) "fizz" (if (= input 5) "buzz" input))
)
