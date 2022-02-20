package com.flow2code.fungussnap
//
//import android.Manifest
//import android.app.Activity
//import android.content.DialogInterface
//import android.content.Intent
//import android.content.pm.PackageManager
//import android.net.Uri
//import android.os.Bundle
//import android.provider.Settings
//import android.util.Log
//import androidx.appcompat.app.AlertDialog
//import androidx.core.app.ActivityCompat
//import androidx.core.content.ContextCompat
//
//class OLDMAIN {
//    val REQUEST_CODE = 200
//    val CAMERA_REQUEST_CODE = 0
//    var permissions: Array<String> = arrayOf<String>(
//        Manifest.permission.READ_EXTERNAL_STORAGE,
//        Manifest.permission.WRITE_EXTERNAL_STORAGE,
//        Manifest.permission.CAMERA)
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        if(askForPermissions()){
//            capturePhoto()
//        }
//    }
//
//    private fun capturePhoto() {
////        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
////        startActivityForResult(cameraIntent, REQUEST_CODE)
//
////        val callCameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
////        if (callCameraIntent.resolveActivity(packageManager) != null) {
////            startActivityForResult(callCameraIntent, CAMERA_REQUEST_CODE)
////        }
////        Log.i("XD","TEst")
//
//    }
//
//    private fun isPermissionsAllowed(): Boolean {
//        for(permission in permissions){
//            Log.i("XD","dasasd")
//            if(ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
//                Log.i("XD",permission)
//                return false
//            }
//        }
//        return true
//    }
//
//    private fun askForPermissions(): Boolean {
//        if (!isPermissionsAllowed()) {
//            Log.i("XD","das")
//            for (permission in permissions){
//                if (ActivityCompat.shouldShowRequestPermissionRationale(this as Activity,permission)) {
//                    showPermissionDeniedDialog()
//                } else {
//                    ActivityCompat.requestPermissions(this as Activity,permissions,REQUEST_CODE)
//                }
//            }
//            return false
//        }
//
//        Log.i("XD","dass")
//        return true
//    }
//
//    override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<String>,grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        when (requestCode) {
//            REQUEST_CODE -> {
//                if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    // permission is granted, you can perform your operation here
//                    askForPermissions()
//                } else {
//                    // permission is denied, you can ask for permission again, if you want
//                }
//                return
//            }
//        }
//    }
//
//    private fun showPermissionDeniedDialog() {
//        AlertDialog.Builder(this)
//            .setTitle("Nie przyznano uprawnień")
//            .setMessage("Dodaj je w ustawieniach.")
//            .setPositiveButton("Przenieś do ustawień",
//                DialogInterface.OnClickListener { dialogInterface, i ->
//                    // send to app settings if permission is denied permanently
//                    val intent = Intent()
//                    intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
//                    val uri = Uri.fromParts("package", getPackageName(), null)
//                    intent.data = uri
//                    startActivity(intent)
//                })
//            .setNegativeButton("Cancel",null)
//            .show()
//    }
//
////    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
////        super.onActivityResult(requestCode, resultCode, data)
////        when(requestCode) {
////            CAMERA_REQUEST_CODE -> {
////                if (resultCode == Activity.RESULT_OK && data != null) {
//////                    imageView.setImageBitmap(data.extras.get("data") as Bitmap)
////                    Log.i("XD","photo taken")
////                }
////            }
////            else -> {
////                Toast.makeText(this, "Unrecognized request code", Toast.LENGTH_SHORT)
////                Log.i("XD","photo not taken")
////            }
////        }
////    }
//}