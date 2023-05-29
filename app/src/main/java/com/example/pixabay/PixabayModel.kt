package com.example.pixabay

data class PixabayModel (
    val hits: ArrayList<ImageModel>


)

data class ImageModel(
    var largeImageURL: String
)


//{
//    "total": 270115,
//    "totalHits": 500,
//    "hits": [
//    {
//        "id": 1770165,
//        "pageURL": "https://pixabay.com/illustrations/roses-collage-vintage-antique-1770165/",
//        "type": "illustration",
//        "tags": "roses, collage, vintage",
//        "previewURL": "https://cdn.pixabay.com/photo/2016/10/25/22/22/roses-1770165_150.png",
//        "previewWidth": 150,
//        "previewHeight": 120,
//        "webformatURL": "https://pixabay.com/get/gfdb07485cad22e0ff2445b7115ebcffa6a3d1b765ff521922793a644404a4ed482f14108e72bace5342d8bc4bb8e28b0ba422825f7df7e86148f85741576d417_640.png",
//        "webformatWidth": 640,
//        "webformatHeight": 512,
//        "largeImageURL": "https://pixabay.com/get/gfa48edc1a58b829ab29330ead4b1faa3c43f935614a24affb54fac47c47359f0255e6387f0b93975c6bae0135491ca6523795f06ddf3856d6f87643006fc0790_1280.png",
//        "imageWidth": 3000,
//        "imageHeight": 2400,
//        "imageSize": 6369203,
//        "views": 986129,
//        "downloads": 492982,
//        "collections": 3322,
//        "likes": 2691,
//        "comments": 705,
//        "user_id": 462611,
//        "user": "ArtsyBee",
//        "userImageURL": "https://cdn.pixabay.com/user/2014/10/01/08-58-08-781_250x250.png"
//    },
//    {
//        "id": 729510,
//        "pageURL": "https://pixabay.com/photos/marguerite-daisy-flower-white-729510/",
//        "type": "photo",
//        "tags": "marguerite, daisy, flower",
//        "previewURL": "https://cdn.pixabay.com/photo/2015/04/19/08/32/marguerite-729510_150.jpg",
//        "previewWidth": 150,
//        "previewHeight": 97,
//        "webformatURL": "https://pixabay.com/get/g62388ddf3a0ea3cdeba600b5d9271aea9d3380e975418a80eedb4b3c9e2c83fed83755550e4fe5d598591da9341b45d7_640.jpg",
//        "webformatWidth": 640,
//        "webformatHeight": 416,
//        "largeImageURL": "https://pixabay.com/get/ga873e39c10dc550c8ab22cf3a32124858447f49e6ea810c746f1e2a9e51bd0f336c0ef6b53ef91fcab9a29349d16d1c1aff484d81acad66e6761065223581e72_1280.jpg",
//        "imageWidth": 1980,
//        "imageHeight": 1289,
//        "imageSize": 307038,
//        "views": 1625106,
//        "downloads": 706973,
//        "collections": 2528,
//        "likes": 2894,
//        "comments": 753,
//        "user_id": 909086,
//        "user": "Bessi",
//        "userImageURL": "https://cdn.pixabay.com/user/2019/04/11/22-45-05-994_250x250.jpg"
//    },
//    {
//        "id": 165819,
//        "pageURL": "https://pixabay.com/photos/rose-flower-dew-dewdrops-droplets-165819/",
//        "type": "photo",
//        "tags": "rose, flower, dew",
//        "previewURL": "https://cdn.pixabay.com/photo/2013/07/21/13/00/rose-165819_150.jpg",
//        "previewWidth": 150,
//        "previewHeight": 99,
//        "webformatURL": "https://pixabay.com/get/g369a6e7632c11811a31bee452b270e5d3b7c9c0e25e45a67d92545da6c1f2db1ae08af0ff648b240af0404f321c24da8_640.jpg",
//        "webformatWidth": 640,
//        "webformatHeight": 423,
//        "largeImageURL": "https://pixabay.com/get/ga66ff77cd7da5abe6830f7c107e5ba9469085a95c3d4399251883cb41d3c963873d4971d174fd12341789e692a2444b7fca8f819a19f41ab32333c570be548bb_1280.jpg",
//        "imageWidth": 4928,
//        "imageHeight": 3264,
//        "imageSize": 4000578,
//        "views": 2127571,
//        "downloads": 691803,
//        "collections": 2497,
//        "likes": 3066,
//        "comments": 765,
//        "user_id": 768,
//        "user": "GLady",
//        "userImageURL": "https://cdn.pixabay.com/user/2023/02/23/18-02-16-112_250x250.jpg"
//    }
//    ]
//}