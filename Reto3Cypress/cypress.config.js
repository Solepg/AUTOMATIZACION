const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    chromeWebSecurity: false,
    video: true,
    viedoCompression: true,
    videoCompression: 15,
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});
