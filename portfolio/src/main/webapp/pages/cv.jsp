<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Download CV</title>
   
    
</head>
<body>
    <button id="downloadButton">Download PDF</button>

    <script>
        document.getElementById("downloadButton").addEventListener("click", function() {
            // URL to the PDF file
            var pdfUrl = 'all_component/mycv.pdf'; // Replace 'path_to_your_pdf_file.pdf' with the actual path to your PDF file
            
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
    </script>
</body>

</html>
