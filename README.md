<h1>Design Patterns</h1>
<ul>
<li>A design pattern is a general repeatable solution to a commonly occurring problem in software design.</li>
<li> A design pattern isn't a finished design that can be transformed directly into code.</li>
<li>It is a description or template for how to solve a problem that can be used in many different situations.</li>
</ul><br>
<strong>Real-World</strong> Examples I implemented:

<h1>1. Strategy Design Pattern:</h1>
<ul>
<p><li>Vehicle subclasses like "Passenger," "Sport," and "Off-road" demand unique drive functionalities. However, a shared drive aspect emerges between "Sport" and "Off-road,"raising concerns about code duplication. </li><li>To address this, the Strategy Pattern is proposed, introducing an interface for shared functionality. Implementing classes represent distinct driving styles, minimizing redundancy, and ensuring adaptability in the evolving vehicle hierarchy.</li></p>
</ul>
<h1>2.Observer Design Pattern:</h1>
<ul>
<p><li>In this scenario, Customers eagerly await a specific product, like a new iPhone. They can make futile daily store visits or face potential email spam from the Store upon the product's arrival. </li>
<li>This conflict necessitates a solution, and the Observer Design Pattern addresses this, efficiently notifying only interested customers, reducing wasted time and resources, and fostering a considerate approach to product updates.</li>
</p>
</ul>
<h1>3.Decorator Design Pattern:</h1>
<ul>
<p><li>Assisting a pizza company, we tackle the challenge of creating an extra topping calculator. Users request toppings, and our task is to dynamically add them, adjusting the price. </li>
<li>This mirrors dynamically adding extra responsibilities to our pizza object at runtime, making the Decorator Design Pattern an apt solution for this requirement.</li> </p>
</ul>
<h1>4.Factory Design Pattern:</h1>
<ul>
<p>
<li>Develop a software application requiring a flexible database connection system. The application must dynamically connect to diverse databases, initially supporting MySQL and Oracle. Future extensibility to include additional databases is crucial.</li>
<li> Implement the Factory Design Pattern to encapsulate connection details, facilitating runtime switching between databases for enhanced flexibility and maintainability.</li>
</p>
</ul>
<h1>5.Abstract Factory Design Pattern:</h1>
<ul>
<p>
<li>Develop a GUI toolkit supporting different themes (e.g., light and dark).The application must create consistent families of buttons, text fields, and checkboxes for each theme.</li>
<li>Utilizing the Abstract Factory pattern ensures cohesive creation of themed UI components. By defining an AbstractFactory interface, we abstract the creation process, allowing concrete factories to generate families of related components consistently.</li>
</p>
</ul>



