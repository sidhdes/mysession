 document.getElementById("getCvButton").addEventListener("click", function() {
            // URL to the PDF file
            var pdfUrl = '/portfolio/src/main/resources/static/all_component/mycv.pdf';

            // Create a temporary anchor element
            var link = document.createElement('a');
            link.href = pdfUrl;
            link.download = 'mycv.pdf'; // Set the filename for download

            // Append the anchor element to the body
            document.body.appendChild(link);

            // Trigger a click event on the anchor element
            link.click();

            // Clean up: remove the anchor element from the body
            document.body.removeChild(link);
        });