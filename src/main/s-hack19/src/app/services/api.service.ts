import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';

interface GetOptions {
  headers?:
    | HttpHeaders
    | {
        [header: string]: string | string[];
      };
  observe?: string;
  params?:
    | HttpParams
    | {
        [param: string]: string | string[];
      };
  reportProgress?: boolean;
  responseType?: string;
  withCredentials?: boolean;
}

@Injectable()
export class ApiService {
  private _apiGatewayUrl = environment.baseUrl;

  constructor(private _http: HttpClient) {}

  fetch({ baseUrl = this._apiGatewayUrl, url, options = {} }: { baseUrl?: string; url: string; options?: {} }) {
    // comenting thi line for a while
    // console.log("api gw", `${baseUrl}${url}`);
    return this._http.get(`${baseUrl}${url}`, options);
  }

  post({
    baseUrl = this._apiGatewayUrl,
    url,
    body,
    options = {}
  }: {
    baseUrl?: string;
    url: string;
    body: any;
    options?: {};
  }) {
    return this._http.post(`${baseUrl}${url}`, body, options);
  }

  update({
    baseUrl = this._apiGatewayUrl,
    url,
    body,
    options = {}
  }: {
    baseUrl?: string;
    url: string;
    body: any;
    options?: {};
  }) {
    return this._http.put(`${baseUrl}${url}`, body, options);
  }
}
