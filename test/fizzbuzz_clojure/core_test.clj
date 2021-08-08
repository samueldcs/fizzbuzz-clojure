(ns fizzbuzz-clojure.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz-clojure.core :refer :all]))

(deftest fizzbuzzTest
  (testing "stringifies"
    (is (= ["1"] (fizzbuzz [1]))))
  (testing "turns 2 into fizz"
    (is (= ["1", "Fizz"] (fizzbuzz [1, 2]))))
  (testing "turns 2 into fizz and 3 into buzz"
    (is (= ["1", "Fizz", "Buzz", "5"] (fizzbuzz [1, 2, 3, 5]))))
  (testing "converts multiples of 2 and 3 to fizzbuzz"
    (is (= ["1", "Fizz", "FizzBuzz", "Buzz"] (fizzbuzz [1, 2, 6, 9]))))
  )
