var urls = [
    "dog",
    "cat",
    "",
]

var endPoints = urls.map(url => "localhost:8080/api/".concat(url));


var body = document.getElementsByTagName("body")[0];

endPoints.forEach(endPoint => {
    var container = document.createElement('div');
var button = document.createElement("button");
button.innerText = endPoint.split('/')[2].toUpperCase();
container.append(button);
body.append(container);
button.onclick = () => {
    fetch(endPoint)
        .then(response => response.json())
.then(result => {
        if (result.indxof("mp4") > 0) {
        Object.values(result).forEach(value => {
            var video = document.createElement('video');
        var source = document.createElement('source');
        source.type = "video/mp4";
        video.append(source);
        container.append(video);
    })
    } else {
        Object.values(result).forEach(value => {
            var image = document.createElement('img');
        image.src = value;
        container.append(image)
    })
    }
})
}
})