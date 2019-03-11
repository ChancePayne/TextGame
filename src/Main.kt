fun main() {
    val weapon = Weapon("Short Sword", 10)
    val armor = Armor("Worn Shirt", 1)
    val greaves = Greaves("Leather Shoes", 1)

    val character = PlayerCharacter("Desmond", 100, weapon, Helmet("Hair", 0), legs = greaves, body = armor)

    val enemy = Enemy("100 Ants", 50, 1, 0)

    while(character.health > 0 && enemy.health > 0) {

    }
}

fun attack(attackerPower: Int, defenderDefense: Int, accuracy: Double = 1.0): Int {
    return 0
}