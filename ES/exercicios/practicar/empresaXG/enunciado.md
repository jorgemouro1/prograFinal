**Reto: Plataforma de Streaming**

**1. Estrutura Base:**

* Crea as interfaces `Reproducible` (cun método `reproducir()`) e `Descargable` (cun método `descargar()`) .


* Crea unha clase abstracta `Contido` cos atributos: `id` (String e inmutable unha vez creado), `titulo` (String) e `minutos` (int) .


* Fai que `Contido` se poida ordenar por defecto pola súa duración (de menor a maior) implementando a interface xenérica adecuada para iso .



**2. As Subclases:**

* Crea a clase `Pelicula` que herde de `Contido` e implemente as dúas interfaces . Para os seus actores, utiliza unha colección que **non permita duplicados** e implementa un método para engadilos .


* Crea a clase `Podcast` que herde de `Contido` e implemente só `Reproducible`. Para os seus oíntes, utiliza unha colección tipo **FIFO** que garde a orde de chegada, con métodos para poñer xente á espera e para sacalos da espera .



**3. O Catálogo (Main):**

* Crea o catálogo xeral utilizando unha colección de pares, onde a clave sexa o `id` do contido e o valor sexa o obxecto en si . Insire un par de películas e podcasts.


* Percorre os valores do catálogo usando un bucle . Por cada elemento:


* Fai que se reproduza (deixando que actúe a ligadura dinámica) .


* Comproba se a súa natureza permite que sexa descargado e, de ser así, descárgao .


* Se o elemento é un podcast, saca ao primeiro oínte da súa liña de espera.



A pensar que estruturas concretas encaixan en cada oco. Sorte!