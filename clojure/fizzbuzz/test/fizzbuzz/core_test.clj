(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest one-returns-one
  (testing "one returns one"
    (is (= (fizz-buzz 1) 1))))

(deftest two-returns-two
  (testing "two returns two"
    (is (= (fizz-buzz 2) 2))
  )
)

(deftest three-returns-fizz
  (testing "three returns fizz"
    (is (= (fizz-buzz 3) "fizz"))
  )
)

(deftest five-returns-buzz
  (testing "five returns buzz"
    (is (= (fizz-buzz 5) "buzz"))
  )
)

(deftest divisible-by-three-returns-fizz
  (testing "divisible by three returns fizz"
    (is (= (fizz-buzz 12) "fizz"))
  )
)

(deftest divisible-by-five-returns-buzz
  (testing "divisible by five returns buzz"
    (is (= (fizz-buzz 20) "buzz"))
  )
)

(deftest fifteen-returns-fizzbuzz
  (testing "fifteen returns fizzbuzz"
    (is (= (fizz-buzz 15) "fizzbuzz"))
  )
)

(deftest one-to-hundred
  (testing "one to hundred"
    (is
      (=
       (fizz-buzz-one-to-hundred)
       '(
         1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz"
         11 "fizz" 13 14 "fizzbuzz" 16 17 "fizz" 19 "buzz"
         "fizz" 22 23 "fizz" "buzz" 26 "fizz" 28 29 "fizzbuzz"
         31 32 "fizz" 34 "buzz" "fizz" 37 38 "fizz" "buzz"
         41 "fizz" 43 44 "fizzbuzz" 46 47 "fizz" 49 "buzz"
         "fizz" 52 53 "fizz" "buzz" 56 "fizz" 58 59 "fizzbuzz"
         61 62 "fizz" 64 "buzz" "fizz" 67 68 "fizz" "buzz"
         71 "fizz" 73 74 "fizzbuzz" 76 77 "fizz" 79 "buzz"
         "fizz" 82 83 "fizz" "buzz" 86 "fizz" 88 89 "fizzbuzz"
         91 92 "fizz" 94 "buzz" "fizz" 97 98 "fizz" "buzz"
        )
      )
    )
  )
)
