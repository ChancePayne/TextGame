class PlayerCharacter(
    var name: String,
    var health: Int,
    var weapon: Weapon,
    var head: Helmet,
    var body: Armor,
    var legs: Greaves
    )

class Weapon(val name: String, val power: Int)

class Helmet(val name: String, val defense: Int)

class Armor(val name: String, val defense: Int)

class Greaves(val name: String, val defense: Int)