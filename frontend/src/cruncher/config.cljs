(ns cruncher.config)

(def api {:host "http://0.0.0.0:5000/"
          :init "api/init/"
          :base "api/"
          :login "api/login"
          :get-all-pokemon "api/pokemon"
          :crunch-selected-pokemon "api/pokemon/delete"})
