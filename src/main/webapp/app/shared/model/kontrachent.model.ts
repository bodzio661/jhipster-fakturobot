import { IFaktura } from 'app/shared/model/faktura.model';

export interface IKontrachent {
  id?: number;
  nazwaKontrachenta?: string;
  emailKontrachenta?: string;
  numerKontrachenta?: string;
  terminKontrachenta?: number;
  fakturas?: IFaktura[];
}

export class Kontrachent implements IKontrachent {
  constructor(
    public id?: number,
    public nazwaKontrachenta?: string,
    public emailKontrachenta?: string,
    public numerKontrachenta?: string,
    public terminKontrachenta?: number,
    public fakturas?: IFaktura[]
  ) {}
}
