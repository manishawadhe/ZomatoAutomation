const { defineConfig } = require("cypress");

module.exports = defineConfig({
 
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    specPattern: "cypress/integration/examples/problem.js"
    
  },
  "chromeWebSecurity": false,
  // "experimentalComponentTesting": true,
  // "experimentalRunEvents": ["test:after:run"]
  
});
