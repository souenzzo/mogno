(ns br.dev.zz.mogno.dev
  (:require [shadow.cljs.devtools.api :as shadow.api]
            [shadow.cljs.devtools.server :as shadow.server]))


(defn -main
  [& _]
  (shadow.server/start!)
  (shadow.api/watch :mogno))


(comment
  (-main))
