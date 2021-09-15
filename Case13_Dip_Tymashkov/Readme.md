# SOLID: #13

The DIP says that high- and low-level modules should depend on
mutual abstractions, and furthermore, that details should depend on
abstractions rather than vice versa. By implementing a dependency
structure that follows this principle, you can free your modules from
one another in a way that opens them up for reuse. So long as an
entity conforms to the prescribed contract of its abstraction
dependencies, it can be used anywhere.
Fix example#13 and add Stove to new Restaurant
