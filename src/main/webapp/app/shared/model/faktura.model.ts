import { Moment } from 'moment';
import { IKontrachent } from 'app/shared/model/kontrachent.model';
import { Type } from 'app/shared/model/enumerations/type.model';
import { Status } from 'app/shared/model/enumerations/status.model';
import { Zaleglosc } from 'app/shared/model/enumerations/zaleglosc.model';

export interface IFaktura {
  id?: number;
  numerFaktury?: string;
  kwotaFaktury?: number;
  dataFaktury?: Moment;
  typFaktury?: Type;
  statusFaktury?: Status;
  zalegloscFaktury?: Zaleglosc;
  kontrachent?: IKontrachent;
}

export class Faktura implements IFaktura {
  constructor(
    public id?: number,
    public numerFaktury?: string,
    public kwotaFaktury?: number,
    public dataFaktury?: Moment,
    public typFaktury?: Type,
    public statusFaktury?: Status,
    public zalegloscFaktury?: Zaleglosc,
    public kontrachent?: IKontrachent
  ) {}
}
