// Last updated: 7/28/2025, 3:25:04 PM
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World" 
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */