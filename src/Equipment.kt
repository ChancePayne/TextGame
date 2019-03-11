class PlayerCharacter(
    var name: String,
    var health: Int,
    var weapon: Weapon,
    var head: Helmet,
    var body: Armor,
    var legs: Greaves
    ) {
    var power = weapon.power

    var defense = head.defense.plus(body.defense).plus(legs.defense)
}

class Weapon(val name: String, val power: Int, val accuracy: Double = 0.9)

class Helmet(val name: String, val defense: Int)

class Armor(val name: String, val defense: Int)

class Greaves(val name: String, val defense: Int)

class Enemy(
    val name: String,
    var health: Int,
    val power: Int,
    val defense: Int)