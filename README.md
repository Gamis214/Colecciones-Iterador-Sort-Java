# Colecciones + Iterador + Sort + Java
Ejemplo aplicando Colecciones + Iterador + Sort en Java

##Ejemplo
###Colecciones en Java
> Una colección de objetos es un objeto que puede almacenar un número variable de elementos siendo cada elemento otro objeto. 
Siguiendo con nuestro símil, podríamos ver una colección como una caja que contiene más cajas dentro. 
Puede haber distintos tipos de colecciones de tamaño “flexible”, es decir, que se pueden encoger o agrandar según las necesidades.
[APR](http://aprenderaprogramar.com/index.php?option=com_content&view=article&id=630:coleccion-de-objetos-de-tamano-variable-java-listas-pilas-colas-collection-list-set-queue-map-cu00664b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188)

![Colecciones](http://images4.hiboox.com/images/4112/aa4511c1758fee865841fa8686db6848.jpg)

Un ejemplo basico seria crear una lista de Strings de la siguiente manera:
```java
List<String> listString = new ArrayList<>();
```

Una vez declarado la lista agregamos elementos a el:
```java
listString.add("A");
listString.add("B");
listString.add("C");
listString.add("D");
```

Tambien podemos generar un listado de Objetos de la siguiente manera:
```java
List<Persona> listPersona = new ArrayList<>();
```

Generamos los objetos para agregar a la lista:
```java
Persona per1 = new Persona("GAMA","HDEZ",461);
Persona per2 = new Persona("DELTA","PEREZ",261);
Persona per3 = new Persona("BADI","JIMENEZ",861);
Persona per4 = new Persona("FER","ORDUÑA",661);

listPersona.add(per1);
listPersona.add(per2);
listPersona.add(per3);
listPersona.add(per4);
```
###Recorriendo una lista
Para recorrer una lista existen diferentes caminos tales como:

* FOR
```java
System.out.println("---- FOR ----");
for (int i = 0; i < listPersona.size() ; i++) {
    System.out.println(listPersona.get(i).getNombre());
}
```

* FOREACH
```java
System.out.println("---- FOREACH ----");
for ( Persona per : listPersona ) {
    System.out.println(per.getNombre());
}
```

* ITERATOR
```java
Iterator<Persona> iterator = listPersona.iterator();
System.out.println("---- ITERATOR ----");
do{
    System.out.println(iterator.next().getNombre());
}while (iterator.hasNext());
```

###Ordenamiento
El ordenamiento puede ser de diferentes maneras, ya se con enteros o por Strings en este caso ordenaremos tanto la lista de String como la de Objetos:
* STRING:
```java
System.out.println("---- ORDENAMIENTO STRINGS----");
Collections.sort(listString, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
});
```
* OBJETOS:
```java
System.out.println("---- ORDENAMIENTO OBJETOS----");
Collections.sort(listPersona, new Comparator<Persona>() {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.nombre.compareToIgnoreCase(o2.nombre);
    }
});
```

###Eliminacion
Podemos eliminar datos de una lista ya se por medio de una busqueda for, foreach, iterator o directamente.
* Conociendo la posicion del elemento
```java
a.remove(1);
```
* Conociendo el contendio de tipo **int**
```java
a.remove(new Integer(1));
```
* Conociendo el String a eliminar
```java
a.remove("Pepe");
```




