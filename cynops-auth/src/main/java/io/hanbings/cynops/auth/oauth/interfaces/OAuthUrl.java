/*
 * Copyright (c) 2021 Hanbings / hanbings Cynops Toolbox.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hanbings.cynops.auth.oauth.interfaces;

@SuppressWarnings("unused")
public class OAuthUrl {
    // Github
    public static final String GITHUB_AUTHORIZE = "https://github.com/login/oauth/authorize";
    public static final String GITHUB_ACCESS_TOKEN = "https://github.com/login/oauth/access_token";
    public static final String GITHUB_USER_DATA = "https://api.github.com/user";
}