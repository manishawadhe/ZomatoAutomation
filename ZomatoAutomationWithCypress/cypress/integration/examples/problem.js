/// <reference types= "cypress"/>
/// <reference types="cypress-xpath" />

import 'cypress-iframe';

describe("zomato test suite",()=>{
    it("login test case", ()=>{
        cy.visit("https://www.zomato.com/");
        cy.wait(6000);
        cy.contains("Log in").click();
        cy.wait(9000);
        
       

        // cy.iframe("#auth-login-ui").then($iframe => {
        //     // Find the element inside the iframe and interact with it
        //     $iframe.find("input[placeholder='Phone']");
        //     $iframe.find('button:contains("Send One Time Password")').click(); // Use find to locate the button and click it
        //   });

        cy.iframe("#auth-login-ui").find("input[type='number']").type("7895722209");
        cy.iframe("#auth-login-ui").find(".gXvQtR").click();

       // Wait for a specific duration (equivalent to Thread.sleep(30000))
        cy.wait(30000);

       

      
    })
})