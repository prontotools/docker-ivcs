(use 'ring.adapter.jetty)
(require '[docker-ivcs.web :as web])

(run-jetty #'web/app {:port 8080})
