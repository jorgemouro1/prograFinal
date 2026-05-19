Festas. Queremos levar o control das principais festas deste agosto. 
Define pois unha clase Festa, con atributos privados lugar e día.
 Define 2 constructores (un con argumentos e outro sen eles). 
 O constructor sen argumentos poñerá como nome “Festa” e como día 0. 
 Define agora os métodos de acceso.
  Crea un método mostrardatos() que mostre todos os atributos da festa. 


Crea 2 subclases: FestaGastronomica e Festival:
FestaGastronomica: Gardaremos o producto que se festexa e o presuposto da festa. 
Crea 2 constructores e os métodos de acceso.
 Crea un método dobrapresuposto( ) que multiplique por 2 o presuposto da festa (por unha subvención da Xunta) e dea unha mensaxe de que o presuposto foi dobrado. 
 Define un método equals( ) que sobreescriba o método equals( ) da clase Object: 2 festas gastronómicas serán iguais se teñen o mesmo presuposto. 
 Redefine tamén o método hashCode( ). 
 Redefine o métodos mostrardatos() que mostre todos os atributos da FestaGastronomica.

Festival: Gardaremos a banda principal do festival, e outro atributo booleano zonaAcampada indicando se hai ou non zona de acampada. Crea ademáis un atributo de clase numFestivais, que comece valendo 0, e que se vaia aumentanto cada vez que se cree un festival. 

Redefine o métodos mostrardatos() que mostre todos os atributos do Festival.

Non repetir código innecersario nas subclases.

Crea noutra clase AppFestas un array de Festas onde gardes 2 obxectos de cada subclase (2 festas gastronómicas e 3 festivais) dando valores aos seus atributos e comproba que funcionan todos os métodos definidos nas clases.

Mostra tamén o número de festivais que hai no mes de agosto.