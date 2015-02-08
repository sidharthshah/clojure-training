(ns hello-world.core
	(:gen-class))

(defn hello 
	[] 
	(doseq [i (range 10)] 
		(println "Dada Bhagwan Na Asim Jai Jaikar Ho!")))


(defn -main 
	"I don't do a whole lot."
	[]
	(hello))
