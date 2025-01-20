# Abstract Factory vs Factory Method Design Patterns

---

## **1. Purpose**

### **Factory Method**
- Defines an interface for creating an object, letting subclasses decide which class to instantiate.
- Focuses on creating a **single product** and relies on **inheritance**.

### **Abstract Factory**
- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Focuses on creating a **group of related products** and relies on **composition**.

---

## **2. Scope**

### **Factory Method**
- Creates a single product (or derived products from a common base class or interface).
- Delegates instantiation logic to subclasses.

### **Abstract Factory**
- Creates multiple related products (e.g., a family like `Button` and `Checkbox` in a GUI toolkit).
- Ensures compatibility between related products in the family.

---

## **3. Class vs. Object**

### **Factory Method**
- Uses **inheritance** to delegate the instantiation of an object to a subclass.
- Each subclass overrides the factory method to create a specific product.

### **Abstract Factory**
- Uses **composition** to provide factories that produce related objects.
- You supply a factory implementation instead of overriding a method.

---

## **4. Key Differences**

| **Aspect**                | **Factory Method**                             | **Abstract Factory**                         |
|---------------------------|-----------------------------------------------|---------------------------------------------|
| **Focus**                 | Creating a single product.                    | Creating families of related products.      |
| **Approach**              | Relies on inheritance to override the factory method. | Relies on composition to create objects.   |
| **Scale**                 | Suitable for a single object.                 | Suitable for groups of objects.            |
| **Example Scenario**      | Decide between creating `Car` or `Truck`.      | Create GUI components (`Button` and `Checkbox`) for Windows or Mac. |

---

## **5. When to Use**

### **Factory Method**
- Delegate object creation to subclasses.
- Need flexibility in choosing the concrete class of a product at runtime.

### **Abstract Factory**
- Ensure compatibility between a family of related products.
- Isolate client code from specific implementations of multiple related objects.