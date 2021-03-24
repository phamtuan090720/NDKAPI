#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_ndkapi_MainActivity_getAPIKey(JNIEnv* env, jobject /* this */) {
    std::string api_key = "aHR0cHM6Ly9tb3ZpZTA3MDYuY3liZXJzb2Z0LmVkdS52bg==";
    return env->NewStringUTF(api_key.c_str());
}
