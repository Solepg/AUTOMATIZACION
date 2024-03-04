const schemaJson = {
  "type": "object",
  "properties": {
    "userId": { "type": "integer" },
    "id": { "type": "integer" },
    "title": { "type": "string" },
    "body": { "type": "string" }
  },
  "required": ["userId", "id", "title", "body"]
  }
   
describe('Prueba RestApi con Cypress', () => {
  it('Consumo de servicio REST',()=>{
    cy.log('//////////////////////////')
    const url='https://jsonplaceholder.typicode.com/posts'
    const methodRest= 'GET'

    cy.log(url)
    cy.log(methodRest)

    cy.request({method: methodRest,url: url}).then((response)=>{
      cy.log('Status Code' + response.status)
      cy.log('Response Body' + JSON.stringify(response.body))
      cy.log('Response Headers' + JSON.stringify(response.headers))
      cy.validateSchema(response.body, schemaJson)
      expect(response.status).to.equal(200) 
      cy.log('///////////////////////////')
    })
  })
})


















 