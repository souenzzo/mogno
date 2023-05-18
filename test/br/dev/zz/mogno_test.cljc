(ns br.dev.zz.mogno-test
  (:require [clojure.test :refer [deftest is]]
            [br.dev.zz.mogno :as mogno]))

(deftest distinct-by
  (is (= [{:id 1}
          {:id 2}
          {:id 3}]
        (sequence (mogno/distinct-by :id)
          [{:id 1}
           {:id 2}
           {:id 3}
           {:id    1
            :extra :field}]))))
