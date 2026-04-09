# Java OOP Interview Traps: Inheritance

**Q: Can a child class access `private` variables of the parent class?**
**A:** No. Private members are strictly locked to the file they are created in. The child class will inherit them in memory, but it cannot directly interact with them unless the parent provides public "getter/setter" methods.

**Q: What happens if you don't write `super()` in a child class constructor?**
**A:** Java will silently insert a hidden, empty `super()` at the very top of the child constructor. If the parent class doesn't have an empty/default constructor, your program will instantly crash.

**Q: In the statement `Box box1 = new BoxWeight();`, what variables can `box1` access?**
**A:** It can ONLY access the variables defined in the `Box` class. **Trap Rule:** The *Type of the Reference Variable* (the left side) determines what you can access, NOT the *Type of the Object* (the right side).

**Q: Why does Java give an error if you type `BoxWeight box2 = new Box();`?**
**A:** Because the child reference (`BoxWeight`) promises to have a `weight` variable, but the parent object (`Box`) doesn't have a `weight` variable to give it. You cannot assign a parent object to a child reference variable.

**Q: Why does Java NOT support Multiple Inheritance with classes?**
**A:** The Diamond Problem. If `Class C extends Class A, Class B`, and both A and B have a method called `display()`, Class C will be confused about which `display()` to run. (Note: Java solves this later using Interfaces).

**Q: What is the ultimate parent class of every single class in Java?**
**A:** The `Object` class. Every class you ever write automatically extends `Object` behind the scenes. 