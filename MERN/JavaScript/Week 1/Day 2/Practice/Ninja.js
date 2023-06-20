class Ninja {
    constructor(name,health,speed=3,strength=3) {
        this.name = name
        this.health= health
        this.speed=speed
        this.strength=strength
    }
    sayName(){
        console.log('My name is ${this.name}');
    }
    showStates(){
        console.log('Name:${this.name},Strength:${this.strangth},Speed: ${this.speed}, Health: ${this.health}');   
    }
    drinkSake(){
        console.log('Health: $(this.health=+10)');
    }
}