import Ajv from "ajv";
 
Cypress.Commands.add('validateSchema', (responseBody, schema) => {
    const ajv = new Ajv({ allErrors: true });
    const valid = ajv.validate(schema, responseBody);
    expect(valid, JSON.stringify(ajv.errors)).to.equal(false);
    });