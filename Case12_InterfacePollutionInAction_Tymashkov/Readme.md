# SOLID: Interface Pollution in Action #12

1. Interface pollution is ultimately a question of desired behavior. If
   an interface exclusively defines behaviors that an implementing
   object actually desires, then pollution won’t be a problem.
   However, if an interface is broad enough as to define behaviors
   that won’t be used universally, then it’s probably worth
   investigating options to break it down.
