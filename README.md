# SHARK: A Test-driven Framework for Design and Evolution of Ontologies

 This repository keeps the source-code of the SHARK framework[1], presented in the ESWC 2018 conference.

An example request to a webservice running locally would be:

`curl -v -F "ontology=@<ontology_path>" -F "shacltest=@<test_path>" -F "format=text/turtle" http://localhost:8081/ws/users/ontologyUpload -H "Content-type: multipart/form-data"`

*Note: It is recommended to run the web application locally in the Firefox browser, as Google Chrome will block local cross origin requests, i.e. block loading the `guideline_form.json` file, thus not rendering the form.*

[1] (url to be included)
