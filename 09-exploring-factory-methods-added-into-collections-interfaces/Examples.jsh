// Pre JDK 9

List<String> trees = new ArrayList<>();
trees.add("Oak");
trees.add("Pine");
trees.add("Teak");
trees = Collections.unmodifiableList(trees)


// JDK 9

List<String> trees1 = List.of("Oak", "Pine", "Teak")
System.out.println("\nPrinting the list trees")
trees1.forEach(System.out::println)

Set<Integer> set1 = Set.of(13,7,19,21)
System.out.println("\nPrinting the set set1")
set1.forEach(System.out::println)

Map<String, String> states = Map.of(
    "FL", "Florida",
    "CA", "California",
    "TX", "Texas")
System.out.println("\nPrinting the states map")
states.forEach((k,v) -> System.out.printf("Key = %s, Value = %s\n", k, v))

System.out.println("\nContains key FL: " + states.containsKey("FL"))
System.out.println("Contains value California: " + states.containsValue("California"))
System.out.println("Contains key MA: " + states.containsKey("MA"))


// Make sure Persons.jsh has been loaded

List<Person> chefs = List.of(
    new Person("Larry", 12),
    new Person("Moe", 13),
    new Person("Curly", 9))

List<Person> managers = List.of(
    new Person("Bill", 25),
    new Person("Sally", 13))

List<Person> servers = List.of(
    new Person("Felix", 3),
    new Person("Herbie", 2),
    new Person("Angie", 4))

System.out.println("\nChefs\n==========")
chefs.forEach(System.out::println)

System.out.println("\nManagers\n==========")
managers.forEach(System.out::println)

System.out.println("\nServers\n==========")
servers.forEach(System.out::println)

List<List<Person>> employees = List.of(
    chefs, managers, servers)
System.out.println("\nEmployees\n==========")
employees.forEach(System.out::println)

// Exceptions
System.out.println("Trying to modify an immutable list");
trees1.add("Maple")

System.out.println("Trying to create a set with duplicate elements")
Set<Integer> dupElement = Set.of(1,2,3,1)

System.out.println("Trying to create a list will a null element")
List<String> nullElement = List.of("Maple", null)


