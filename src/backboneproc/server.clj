(ns backboneproc.server
  (:require [noir.server :as server]
            [noir.response :as resp])
  (:use [noir.core :only [defpage]])
)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "1337"))
        ]
    (server/start port {:mode mode
                        :ns 'backboneproc
})))

(defpage "/" []
  (resp/redirect "/index.html"))