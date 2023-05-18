(ns br.dev.zz.mogno)

(defn distinct-by
  "Like clojure.core/distinct but transforms each element with f before do the distinction."
  [f]
  (fn [rf]
    (let [seen (volatile! #{})]
      (fn
        ([] (rf))
        ([result] (rf result))
        ([result input]
         (let [v (f input)]
           (if (contains? @seen v)
             result
             (do (vswap! seen conj v)
                 (rf result input)))))))))
