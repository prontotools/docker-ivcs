(ns docker-ivcs.web)
(require '[ring.middleware.json :refer [wrap-json-response]]
         '[ring.util.response :refer [response]])

(defn handler [request]
  (response {:message "Hello World from docker-ivcs"}))

(def app
  (wrap-json-response handler))