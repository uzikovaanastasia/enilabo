String str = "Tutorials Point";
IntStream stream = str.chars();
stream.forEach(element -> System.out.println(((char)element))); // using lambda expression
