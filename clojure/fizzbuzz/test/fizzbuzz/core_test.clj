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
