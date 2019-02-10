// Make sure Person.jsh has been loaded


Person p = new Person("Frank", 13)

ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("saved.ser"))
oos.writeObject(p)
oos.close()

ObjectInputStream ois = new ObjectInputStream(new FileInputStream("saved.ser"))
Person newPerson = (Person) ois.readObject()
ois.close()

