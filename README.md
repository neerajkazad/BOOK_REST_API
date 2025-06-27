SMNK29: 26_BOOK_REST_API

This is the example for How to use Consumes and Produces in REST API.

  @PostMapping(value = "/book", consumes = {"application/xml", "application/json"})
  @GetMapping(value = "/book", produces = {"application/xml", "application/json"})

When to use consumes = {"application/xml","application/json"} and when to use prouduces = {"application/xml","application/json"}
