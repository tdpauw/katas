(ns fizzbuzz.core)

(defn divisible-by [dividend divisor]
  (zero? (mod dividend divisor))
)

(defn divisible-by-three [input]
  (divisible-by input 3)
)

(defn divisible-by-five [input]
  (divisible-by input 5)
)

(defn fizz-buzz [input]
  (cond
     (and (divisible-by-three input) (divisible-by-five input)) "fizzbuzz"
     (divisible-by-three input) "fizz"
     (divisible-by-five input) "buzz"
     :else input)
)
