package com.xiaojinzi.component;

/**
 * time   : 2018/07/26
 *
 * @author : xiaojinzi 30212
 */
public class ComponentConstants {

    private ComponentConstants() {
    }

    // System interface

    public static final String ACTIVITY = "android.app.Activity";

    public static final String APPLCATON_INTERFACE_CLASS_NAME = "com.xiaojinzi.component.application.IComponentApplication";
    public static final String INTERCEPTOR_INTERFACE_CLASS_NAME = "com.xiaojinzi.component.impl.RouterInterceptor";
    public static final String INTERCEPTOR_UTIL_CLASS_NAME = "com.xiaojinzi.component.impl.interceptor.RouterInterceptorCache";
    public static final String ROUTER_CLASS_NAME = "com.xiaojinzi.component.impl.Router";
    public static final String INTERCEPTOR_BEAN_CLASS_NAME = "com.xiaojinzi.component.impl.interceptor.InterceptorBean";
    public static final String CENTERINTERCEPTOR_CLASS_NAME = "com.xiaojinzi.component.impl.interceptor.InterceptorCenter";
    public static final String SERVICE_CLASS_NAME = "com.xiaojinzi.component.impl.service.Service";
    public static final String CENTERSERVICE_CLASS_NAME = "com.xiaojinzi.component.impl.service.ServiceCenter";
    public static final String PARAMETERSUPPORT_CLASS_NAME = "com.xiaojinzi.component.support.ParameterSupport";
    public static final String PARAMETERINJECT_CLASS_NAME = "com.xiaojinzi.component.support.ParameterInject";
    public static final String NAVIGATIONDISPOSABLE_CLASS_NAME = "com.xiaojinzi.component.support.NavigationDisposable";
    public static final String CALLBACK_CLASS_NAME = "com.xiaojinzi.component.impl.Callback";
    public static final String BICALLBACK_CLASS_NAME = "com.xiaojinzi.component.impl.BiCallback";
    public static final String CALL_CLASS_NAME = "com.xiaojinzi.component.impl.Call";
    public static final String NAVIGATOR_CLASS_NAME = "com.xiaojinzi.component.impl.Navigator";
    public static final String ROUTER_REQUEST_CLASS_NAME = "com.xiaojinzi.component.impl.RouterRequest";
    public static final String CONSUMER_CLASS_NAME = "com.xiaojinzi.component.support.Consumer";

    public static final String ANDROID_PARCELABLE = "android.os.Parcelable";
    public static final String ANDROID_APPLICATION = "android.app.Application";
    public static final String ANDROID_CONTEXT = "android.content.Context";
    public static final String ANDROID_V4_FRAGMENT = "androidx.fragment.app.Fragment";
    public static final String ANDROID_ACTIVITY = "android.app.Activity";
    public static final String ANDROID_INTENT = "android.content.Intent";
    public static final String ANDROID_ANNOTATION_NULLABLE = "androidx.annotation.Nullable";
    public static final String ANDROID_ANNOTATION_NONNULL = "androidx.annotation.NonNull";
    public static final String ANDROID_BUNDLE = "android.os.Bundle";

    public static final String JAVA_CLASS = "java.lang.Class";
    public static final String JAVA_EXCEPTION = "java.lang.Exception";
    public static final String JAVA_STRING = "java.lang.String";
    public static final String JAVA_MAP = "java.util.Map";
    public static final String JAVA_LIST = "java.util.List";
    public static final String JAVA_COLLECTIONS = "java.util.Collections";
    public static final String JAVA_ARRAYLIST = "java.util.ArrayList";
    public static final String JAVA_SERIALIZABLE = "java.io.Serializable";
    public static final String JAVA_CHARSEQUENCE = "java.lang.CharSequence";

    public static final String SEPARATOR = "/";

    /**
     * 默认的目标字段注入的class后缀
     */
    public static final String INJECT_SUFFIX = "_inject";

}
