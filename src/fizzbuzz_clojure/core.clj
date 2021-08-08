(ns fizzbuzz-clojure.core)

(defn fizz? [num]
  (zero? (mod num 2)))

(defn buzz? [num]
  (zero? (mod num 3)))

(defn fizzbuzz? [num]
  (and (fizz? num) (buzz? num)))

(defn fizzbuzz [x]
  (map #(cond
           (fizzbuzz? %) "FizzBuzz"
           (fizz? %) "Fizz"
           (buzz? %) "Buzz"
           :else (str %)
           ) x))


