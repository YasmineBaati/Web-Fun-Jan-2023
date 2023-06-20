class Ninja {
    constructor(name,health) {
        this.name = name
        this.health= health
        this.speed=3
        this.strength=3
    }
    sayName(){
        console.log('My name is ${this.name}');
        return this;
    }
    showStates(){
        console.log('Name:${this.name},Strength:${this.strangth},Speed: ${this.speed}, Health: ${this.health}'); 
        return this;  
    }
    drinkSake(){
        this.health=+10
        console.log('Health: $(this.health)');
        return this;  
    }
}